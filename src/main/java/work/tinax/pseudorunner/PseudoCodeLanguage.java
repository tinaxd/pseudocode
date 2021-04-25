package work.tinax.pseudorunner;

import com.oracle.truffle.api.TruffleLanguage;

import work.tinax.pseudorunner.runtime.PseudoCodeContext;

@TruffleLanguage.Registration(id=PseudoCodeLanguage.ID, name="PSC")
public class PseudoCodeLanguage extends TruffleLanguage<PseudoCodeContext> {

	public static final String ID = "PSC";
	public static final String MIME_TYPE  = "application/x-psc";
	
	@Override
	protected PseudoCodeContext createContext(Env env) {
		return new PseudoCodeContext();
	}

}
