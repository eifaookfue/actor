package views.form;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import org.apache.commons.lang3.StringUtils;

import com.google.inject.Inject;

import play.data.validation.ValidationError;
import play.i18n.Lang;
import play.i18n.Messages;
import play.i18n.MessagesApi;


public class ActorForm {
	public String id = "";
	public String name = "";
	public String height = "";
	public String blood = "";
	public String birthday = "";
	public String birthplaceId = "";
	private Messages messages;

	public ActorForm() {
		messages = null;
	}

	@Inject
	public ActorForm(String id, String name, String height, String blood,
	      String birthday, String birthplaceId, MessagesApi messageApi) {
	    this.id = id;
	    this.name = name;
	    this.height = height;
	    this.blood = blood;
	    this.birthday = birthday;
	    this.birthplaceId = birthplaceId;
	    Collection<Lang> candidates = Collections.singletonList(new Lang(Locale.JAPANESE));
	    this.messages = messageApi.preferred(candidates);
	  }

	public List<ValidationError> validate() {

		List<ValidationError> errors = new ArrayList<ValidationError>();

		if (name == null || name.length() == 0) {
			errors.add(new ValidationError("name", messages.at("actor.name.required")));
		}
		if (StringUtils.isNotEmpty(height)) {
			Integer tmpH = Integer.valueOf(height);
			if (tmpH < 1 && tmpH > 200) {
				errors.add(new ValidationError("height", messages.at("actor.height.range", 1, 200)));
			}
		}
		if (StringUtils.isNotEmpty(blood) && !blood.matches("A|B|AB|O")) {
			errors.add(new ValidationError("blood", messages.at("actor.blood.kind")));
		}
		if (StringUtils.isNotEmpty(birthday) && !birthday.matches("\\d{4}-\\d{2}-\\d{2}")) {
			errors.add(new ValidationError("birthday", messages.at("actor.birthday.pattern")));
		}
		if (StringUtils.isNotEmpty(birthplaceId)) {
			Integer tmpB = Integer.valueOf(birthplaceId);
			if (tmpB < 1 && tmpB > 47) {
				errors.add(new ValidationError("birthplaceId", messages.at("actor.birthplace.range")));
			}
		}

		if (errors.size() > 0) {
			System.out.println("ActorForm#validate errors");
			return errors;
		}

		return null;
	}

	@Override
	public String toString() {
		return "ActorForm [id=" + id + ", name=" + name + ", height=" + height + ", blood=" + blood + ", birthday="
				+ birthday + ", birthplaceId=" + birthplaceId + "]";
	}

}
