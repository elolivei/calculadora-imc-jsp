package br.ufg.imc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/imc")
public class ImcController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pesoStr = req.getParameter("peso");
        String alturaStr = req.getParameter("altura");

        if(isEntadaValida(pesoStr,alturaStr)){
            int peso = Integer.parseInt(pesoStr);
            float altura = Float.parseFloat(alturaStr);

            ImcModel imcModel = new ImcModel();
            imcModel.setPeso(peso);
            imcModel.setAltura(altura);
            imcModel.calcular();

            String resultado = imcModel.getResultado();
            req.setAttribute("resultado", resultado);
        }else{
            req.setAttribute("resultado", "Informe somente números...");
        }
        //Chamando o JSP com o atributo "resultado".
        req.getRequestDispatcher("imc-view.jsp").forward(req, resp);
    }

    private boolean isEntadaValida(String pesoStr, String alturaStr){
        return pesoStr != null && pesoStr.matches("^[0-9]{1,5}$") && 
                alturaStr != null && alturaStr.matches("^[0-9]{1,5}$");

    }

}
