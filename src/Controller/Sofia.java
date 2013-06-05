package Controller;

import java.io.*;
import java.util.ArrayList;

import javax.servlet.*;
import javax.servlet.http.*;

import Model.Colecao;
import Model.Livro;

public class Sofia extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();		
		Livro livro1 = null;
		Colecao col = null;
		if(request.getParameter("colecao1") == "")
		{
			livro1 = new Livro(request.getParameter("titulo1"), request.getParameter("autor1"),
					    request.getParameter("descricao1"), request.getParameter("numLivro"));		
			out.println(livro1.toString()+"\n --->Avulso");
		}
		else
		{

		
				col = new Colecao(request.getParameter("titulo1"), request.getParameter("autor1"),
				   	request.getParameter("descricao1"), request.getParameter("numLivro"), request.getParameter("colecao1"));
				out.println(col.toString()+" --->Coleção");
		}
		

		
		/*RequestDispatcher rd = request.getRequestDispatcher("/retornoForm.jsp");
		rd.forward(request,response);*/
		
	}
}
