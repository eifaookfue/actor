package controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Inject;

import io.ebean.Ebean;
import io.ebean.SqlRow;
import io.ebean.SqlUpdate;
import io.ebean.Transaction;
import models.Actor;
import models.Prefecture;
import play.data.Form;
import play.data.FormFactory;
import play.i18n.Messages;
import play.i18n.MessagesApi;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import utils.DateParser;
import views.form.ActorForm;
import views.html.*;


public class Application extends Controller{
	private static final Logger logger = LoggerFactory.getLogger(Application.class);
	@Inject
	private FormFactory formFactory;

	@Inject
	private MessagesApi messagesApi;

	public Result index (Http.Request request) {
		logger.info("Application#index");
		List<Actor> actor = Actor.finder.all();
		return ok(index.render("Actor List", actor, messagesApi.preferred(request)));
	}

	public Result detail(Http.Request request, Long id) {
		logger.info("Application#detail");
		Actor actor = Actor.finder.byId(id);
		return ok(detail.render("Action Detail", actor, messagesApi.preferred(request)));
	}

	public Result create(Http.Request request) {
		logger.info("Application#create");
		ActorForm form  = new ActorForm();

		Form<ActorForm> formData = formFactory.form(ActorForm.class).fill(form);
		return ok(create.render("Actor Create", formData, messagesApi.preferred(request)));
	}

	public Result save(Http.Request request) {
		logger.info("Application#save");
		Form<ActorForm> formData = formFactory.form(ActorForm.class).bindFromRequest();
		if (formData.hasErrors()){
			Messages messages = messagesApi.preferred(request);
			String message = messages.at("actor.validation.error");
			return badRequest(create.render("retry", formData, messagesApi.preferred(request))).flashing("error",message);
		} else {
			Actor actor = Actor.convertToModel(formData.get());
			Ebean.execute(() -> {
				SqlRow row = Ebean.createSqlQuery("SELECT MAX(id) AS cnt FROM actor").findOne();
				Long cnt = row.getLong("cnt");
				actor.id = cnt == null ? 1L : (cnt + 1L);
				actor.save();
			});
		}
		Messages messages = messagesApi.preferred(request);
		String message = messages.at("actor.save.success");
		return redirect(routes.Application.index()).flashing("success", message);
	}

	public Result delete(Http.Request request, Long id) {
		logger.info("Application#delete");
		if (id == null || id == 0L) {
			Messages messages = messagesApi.preferred(request);
			List<Actor> actor = Actor.finder.all();
			return badRequest(index.render("Actor List", actor, messages)).flashing("error", messages.at("actor.validation.error"));
		} else {
			Boolean result = Ebean.executeCall(() -> {
				Actor actor = Actor.finder.byId(id);
				actor.delete();
				return Boolean.TRUE;
			});

			if (result) {
				return redirect(routes.Application.index()).flashing("success", messagesApi.preferred(request).at("actor.delete.success"));
			} else {
				return redirect(routes.Application.index()).flashing("error", messagesApi.preferred(request).at("actor.delete.error"));
			}
		}
	}

	public Result init(Http.Request request) {
		logger.info("Application#init");

		try (Transaction txn = Ebean.beginTransaction()) {

			SqlUpdate actorAllDelete = Ebean.createSqlUpdate("DELETE FROM actor");
			actorAllDelete.execute();

			txn.setBatchMode(true);
			txn.setBatchSize(10);
			txn.setBatchGetGeneratedKeys(false);

			new Actor(1L, "丹波哲郎", 175, "O", DateParser.parse("1922-07-17"), 13).save();
			new Actor(2L, "森田健作", 175, "O", DateParser.parse("1949-12-16"), 13).save();
			new Actor(3L, "加藤剛", 173, null, DateParser.parse("1949-12-16"), 22).save();
			new Actor(4L, "島田陽子", 171, "O", DateParser.parse("1953-05-17"), 43).save();
			new Actor(5L, "山口果林", null, null, DateParser.parse("1947-05-10"), 13).save();
			new Actor(6L, "佐分利信", null, null, DateParser.parse("1909-02-12"), 1).save();
			new Actor(7L, "緒方拳", 173, "B", DateParser.parse("1937-07-20"), 13).save();
			new Actor(8L, "松山政路", 167, "A", DateParser.parse("1947-05-21"), 13).save();
			new Actor(9L, "加藤嘉", null, null, DateParser.parse("1913-01-12"), 13).save();
			new Actor(10L, "菅井きん", 155, "B", DateParser.parse("1926-02-28"), 13).save();
			new Actor(11L, "笠智衆", null, null, DateParser.parse("1904-05-13"), 43).save();
			new Actor(12L, "殿山泰司", null, null, DateParser.parse("1915-10-17"), 28).save();
			new Actor(13L, "渥美清", 173, "B", DateParser.parse("1928-03-10"), 13).save();

			SqlUpdate prefectureAllDelete = Ebean.createSqlUpdate("DELETE FROM prefecture");
			prefectureAllDelete.execute();

			new Prefecture(1, "北海道").save();
			new Prefecture(2, "青森県").save();
			new Prefecture(3, "岩手県").save();
			new Prefecture(4, "宮城県").save();
			new Prefecture(5, "秋田県").save();
			new Prefecture(6, "山形県").save();
			new Prefecture(7, "福島県").save();
			new Prefecture(8, "茨城県").save();
			new Prefecture(9, "栃木県").save();
			new Prefecture(10, "群馬県").save();
			new Prefecture(11, "埼玉県").save();
			new Prefecture(12, "千葉県").save();
			new Prefecture(13, "東京都").save();
			new Prefecture(14, "神奈川県").save();
			new Prefecture(15, "新潟県").save();
			new Prefecture(16, "富山県").save();
			new Prefecture(17, "石川県").save();
			new Prefecture(18, "福井県").save();
			new Prefecture(19, "山梨県").save();
			new Prefecture(20, "長野県").save();
			new Prefecture(21, "岐阜県").save();
			new Prefecture(22, "静岡県").save();
			new Prefecture(23, "愛知県").save();
			new Prefecture(24, "三重県").save();
			new Prefecture(25, "滋賀県").save();
			new Prefecture(26, "京都府").save();
			new Prefecture(27, "大阪府").save();
			new Prefecture(28, "兵庫県").save();
			new Prefecture(29, "奈良県").save();
			new Prefecture(30, "和歌山県").save();
			new Prefecture(31, "鳥取県").save();
			new Prefecture(32, "島根県").save();
			new Prefecture(33, "岡山県").save();
			new Prefecture(34, "広島県").save();
			new Prefecture(35, "山口県").save();
			new Prefecture(36, "徳島県").save();
			new Prefecture(37, "香川県").save();
			new Prefecture(38, "愛媛県").save();
			new Prefecture(39, "高知県").save();
			new Prefecture(40, "福岡県").save();
			new Prefecture(41, "佐賀県").save();
			new Prefecture(42, "長崎県").save();
			new Prefecture(43, "熊本県").save();
			new Prefecture(44, "大分県").save();
			new Prefecture(45, "宮崎県").save();
			new Prefecture(46, "鹿児島県").save();
			new Prefecture(47, "沖縄県").save();

			txn.commit();

		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}

		return redirect(routes.Application.index());
	}

}
