package health.doctor;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DoctorSetPassword {
	@RequestMapping(value="/dreset")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
		DoctorUsers u = new DoctorUsers();
		HttpSession session = request.getSession(true);       
        String userid = (String)session.getAttribute("User");
        System.out.println(userid);
        u.setUserid(userid);
        u.setPassword(request.getParameter("password"));
        int status=DoctorUsersDao.setPassword(u);
        if(status>0) {
        		request.setAttribute("status", "Updated Successfully");
			request.getRequestDispatcher("/WEB-INF/patient/dpasssuccess.jsp").forward(request, response);
        }
        else {
        		request.setAttribute("status", "Password Updation Failed......TRY AGAIN");
			request.getRequestDispatcher("/WEB-INF/patient/dresetpass.jsp").forward(request, response);
        }
	}
}
