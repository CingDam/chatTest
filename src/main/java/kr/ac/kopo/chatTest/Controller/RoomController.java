package kr.ac.kopo.chatTest.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.kopo.chatTest.Service.ChatRoomService;
import kr.ac.kopo.chatTest.model.ChatRoom;
import kr.ac.kopo.chatTest.model.Member;

@Controller
@RequestMapping("/room")
public class RoomController {
	final private String path = "room/";
	
	@Autowired
	ChatRoomService service;
	
	@GetMapping({"/","/list"})
	public String list(Model model,HttpSession session) {
		
		
		List<ChatRoom> list = service.list();
		
		model.addAttribute("list", list);
		
		return path + "list";
		
	}
	
	@GetMapping("/add")
	public String add() {
		return path + "add";
	}
	
	@PostMapping("/add")
	public String add(ChatRoom item,HttpSession session) {
		service.add(item);
		return "redirect:.";
	}
	
	@GetMapping("/delete/{roomCode}")
	public String delete(@PathVariable int roomCode) {
		service.delete(roomCode);
		return "redirect:.";
	}
	
}
