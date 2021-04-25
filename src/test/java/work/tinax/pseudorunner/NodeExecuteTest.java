package work.tinax.pseudorunner;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

import com.oracle.truffle.api.CallTarget;
import com.oracle.truffle.api.Truffle;

import work.tinax.pseudorunner.nodes.*;
import work.tinax.pseudorunner.parser.PseudoCodeLexer;
import work.tinax.pseudorunner.parser.PseudoCodeParser;

public class NodeExecuteTest {
	@Test
	public void addIntegers() {
		PSExpressionNode node = new PSAddNode(
					new PSIntegerLiteralNode(12),
					new PSIntegerLiteralNode(34)
				);
		var root = new PSRootNode(new PSDumpNode(node));
		CallTarget callTarget = Truffle.getRuntime().createCallTarget(root);
		
		var result = callTarget.call();
		
		//assertEquals(46, result);
		assertNull(result);
	}
	
	@Test
	public void integersInARow() {
		var i1 = new PSIntegerLiteralNode(1);
		var i2 = new PSIntegerLiteralNode(2);
		var i3 = new PSIntegerLiteralNode(3);
		var dump = new PSDumpNode(new PSAddNode(i1, new PSAddNode(i2, i3)));
		var root = new PSRootNode(dump);
		CallTarget callTarget = Truffle.getRuntime().createCallTarget(root);
		
		var result = callTarget.call();
		
		//assertEquals(2, result);
		assertNull(result);
	}
	
	@Test
	public void variableSetThenGet() {
		var set = new PSAssignmentNode("myint", new PSIntegerLiteralNode(5));
		var get = new PSDumpNode(new PSVariableNode("myint"));
		var block = new PSStatementBlockNode(new PSStatementNode[] {
			set, get
		});
		var root = new PSRootNode(block);
		CallTarget callTarget = Truffle.getRuntime().createCallTarget(root);
		
		var result = callTarget.call();
		
		//assertEquals(5, result);
		assertNull(result);
	}
	
	@Test
	public void variableABCTest() {
		var a = new PSAssignmentNode("a", new PSIntegerLiteralNode(1));
		var b = new PSAssignmentNode("b", new PSIntegerLiteralNode(6));
		var c = new PSAssignmentNode("c", new PSAddNode(
					new PSVariableNode("a"),
					new PSVariableNode("b")
				));
		var cget = new PSDumpNode(new PSVariableNode("c"));
		var block = new PSStatementBlockNode(new PSStatementNode[] {
			a, b, c, cget
		});
		var root = new PSRootNode(block);
		CallTarget callTarget = Truffle.getRuntime().createCallTarget(root);
		
		var result = callTarget.call();
		
		//assertEquals(7, result);
		assertNull(result);
	}
	
	@Test
	public void textBasicVariableAssignment() {
		String source = "a <- 7\ndump a";
		//var stream = new ByteArrayInputStream(source.getBytes(StandardCharsets.UTF_8));
		PseudoCodeLexer lexer = new PseudoCodeLexer(CharStreams.fromString(source));
		PseudoCodeParser parser = new PseudoCodeParser(new CommonTokenStream(lexer));
		NodeCreator creator = new NodeCreator();
		PseudoCodeParser.ProgramContext program = parser.program();
		PSNode node = creator.visit(program);
		System.out.println(node);
		var root = new PSRootNode((PSStatementNode) node);
		CallTarget callTarget = Truffle.getRuntime().createCallTarget(root);
		
		var result = callTarget.call();
		
		assertNull(result);
	}
}
