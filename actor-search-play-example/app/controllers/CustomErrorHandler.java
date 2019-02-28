package controllers;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import javax.inject.Provider;

import com.google.inject.Inject;
import com.typesafe.config.Config;

import play.Environment;
import play.api.OptionalSourceMapper;
import play.api.routing.Router;
import play.http.DefaultHttpErrorHandler;
import play.mvc.Http.RequestHeader;
import play.mvc.Result;
import play.mvc.Results;
import views.html.errors.*;

public class CustomErrorHandler extends DefaultHttpErrorHandler{

	@Inject
	public CustomErrorHandler(Config config, Environment environment,
			OptionalSourceMapper sourceMapper, Provider<Router> routes) {
		super(config, environment, sourceMapper, routes);
		System.out.println("CustomErrorHandler constructor");
	}

	@Override
	protected CompletionStage<Result> onNotFound(RequestHeader request, String message) {
		return CompletableFuture.completedFuture(
			Results.internalServerError(notfound.render("ページがみつかりません", message, 404))
		);
	}

}
