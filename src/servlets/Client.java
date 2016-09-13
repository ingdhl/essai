package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datas.ClientDatas;

public class Client extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String mode =(String) req.getParameter("mode");
		if (mode == null){
			req.setAttribute("listeClients", ClientDatas.getAllClients());
			req.setAttribute("mode", mode);
			this.getServletContext().getRequestDispatcher("/WEB-INF/Clients.jsp").forward(req, resp);			
		}else{
			if (mode == "1")
				this.getServletContext().getRequestDispatcher("/WEB-INF/FormClient.jsp").forward(req, resp);
		}

	}
	
	

}
