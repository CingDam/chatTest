package kr.ac.kopo.chatTest.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.kopo.chatTest.Service.MemberService;
import kr.ac.kopo.chatTest.model.Member;


@Controller
public class ChatTestController {
	
	@Autowired
	MemberService service;

	@GetMapping("/")
	public String login() {
		return "login";
	}
	@PostMapping("/")
	public String login(Member member,HttpSession session) {
		if(service.login(member)) {
			session.setAttribute("member", member);
			return "chatTest";
		}
		
		return "redirect:.";
	}
}
