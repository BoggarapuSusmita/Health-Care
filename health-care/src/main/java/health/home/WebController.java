package health.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
	@RequestMapping(value="/h")
	public String home(){
		return "home";
	}
	@RequestMapping(value="/patientlogin")
	public String patientlogin(){
		return "patientlogin";
	}
	@RequestMapping(value="/patientregister")
	public String patientregister(){
		return "patientregister";
	}
	@RequestMapping(value="/doctorlogin")
	public String doctorlogin(){
		return "doctorlogin";
	}
	@RequestMapping(value="/doctorregister")
	public String doctorregister(){
		return "doctorregister";
	}
	@RequestMapping(value="/pfpass")
	public String pfpass(){
		return "pfpass";
	}
	@RequestMapping(value="/dfpass")
	public String dfpass(){
		return "dfpass";
	}
	@RequestMapping(value="/search")
	public String search(){
		return "search";
	}
	@RequestMapping(value="/referdoc")
	public String refdoc(){
		return "refdoctor";
	}
	@RequestMapping(value="/psuccess")
	public String psuccess(){
		return "patientlogin";
	}
	@RequestMapping(value="/dsuccess")
	public String dsuccess(){
		return "doctorlogin";
	}
	@RequestMapping(value="/addcare")
	public String addcare(){
		return "addcare";
	}
}
