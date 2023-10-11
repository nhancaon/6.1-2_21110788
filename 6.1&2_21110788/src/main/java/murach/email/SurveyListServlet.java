package murach.email;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import murach.business.User;

@WebServlet("/surveyList")
public class SurveyListServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String url = "/index.jsp";
		request.setCharacterEncoding("UTF-8");
		// get current action
		String action = request.getParameter("action");
		if (action == null) {
			action = "join";
		}
		// perform action and set URL to appropriate page
		if (action.equals("join")) {
			url = "/index.jsp"; // the "join" page

		} else if (action.equals("add")) {
			// get parameter from the request
			String firstName = request.getParameter("firstName");
			String lastName = request.getParameter("lastName");
			String email = request.getParameter("email");
			String dateOfBirth = request.getParameter("dateofbirth");
			String heardFrom = request.getParameter("radio_c");
			String updates = request.getParameter("checkbox_c");
			String contactVia = request.getParameter("typeofContact");
			String message = "";
			if (updates == null)
				updates = "No";
			User user = new User(firstName, lastName, email, dateOfBirth, heardFrom, updates, contactVia);

			if (firstName == null || lastName == null || email == null || dateOfBirth == null || firstName.isEmpty()
					|| lastName.isEmpty() || email.isEmpty() || dateOfBirth.isEmpty()) {
				message = "Please fill out all four text boxes.";
				url = "/index.jsp";
			} else {
				GregorianCalendar currentDate = new GregorianCalendar();
				int currentDay = currentDate.get(Calendar.DAY_OF_MONTH);
				int currentMonth = currentDate.get(Calendar.MONTH);

				message = "Here is the information that you enter:";
				url = "/survey.jsp";
				request.setAttribute("currentDay", currentDay);
				request.setAttribute("currentMonth", currentMonth);
			}
			request.setAttribute("user", user);
			request.setAttribute("message", message);
		}

		// forward request and response objects to specified URL
		getServletContext().getRequestDispatcher(url).forward(request, response);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		
		doPost(request, response);
	}
}
