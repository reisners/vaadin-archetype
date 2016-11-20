package ${package}.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Presenter {

	private static final Logger log = LoggerFactory.getLogger(LoginView.class);
	
	private MainView mainView;

	public Presenter(MainView mainView) {
		this.mainView = mainView;
	}

	public void login(String username, String password) {
		log.info("user "+username+" logged in, navigating to AnotherView");
		mainView.showAnother();
	}

	
}
