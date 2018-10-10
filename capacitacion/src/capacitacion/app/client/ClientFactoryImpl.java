package capacitacion.app.client;

import capacitacion.app.client.view.GreetingView;
import capacitacion.app.client.view.impl.GreetingImpl;

public class ClientFactoryImpl implements ClientFactory {
	
	private final GreetingView greetingView = new GreetingImpl();

	@Override
	public GreetingView getGreetingView() {
		return greetingView;
	}

}
