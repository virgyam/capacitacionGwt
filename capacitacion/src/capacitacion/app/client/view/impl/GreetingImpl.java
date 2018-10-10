package capacitacion.app.client.view.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

import capacitacion.app.client.view.GreetingView;

public class GreetingImpl extends Composite implements GreetingView {

	private static GreetingImplUiBinder uiBinder = GWT.create(GreetingImplUiBinder.class);

	interface GreetingImplUiBinder extends UiBinder<Widget, GreetingImpl> {
	}

	public GreetingImpl() {
		initWidget(uiBinder.createAndBindUi(this));
		errorLabel.setStyleName("labelError");
	}

	@UiField
	Button sendButton;
	
	@UiField
	TextBox nameField;
	
	@UiField
	Label errorLabel;
	
	@UiField
	DialogBox dialogBox;
	
	@UiField
	Label textToServerLabel;
	
	@UiField	
	HTML serverResponseLabel;
	
	@UiField
	Button closeButton;


	@UiHandler("sendButton")
	void onClick(ClickEvent e) {
		errorLabel.setText("Hola! Aun no hay llamado a RPC");
	}

	public void setText(String text) {
		sendButton.setText(text);
	}

	public String getText() {
		return sendButton.getText();
	}

}
