package no.nith.pg560.interfaces.web;


import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class SearchTechnologyController {

	@Inject
	private Conversation conversation;
	
	
}
