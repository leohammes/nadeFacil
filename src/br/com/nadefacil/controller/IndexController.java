package br.com.nadefacil.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@RequestScoped
@ManagedBean
public class IndexController {
	
	public List<String> getSlideShowImageSrcs() {
		List<String> srcs = new ArrayList<String>();
		srcs.add("/image/slide-show-1.jpg");
		srcs.add("/image/slide-show-2.jpg");
		srcs.add("/image/slide-show-3.jpg");
		return srcs;
	}
	
	public String getImageSrc() {
		return "/image/natacao-card-header.jpg";
	}
	
	public String getTitle() {
		return "Nata��o";
	}
	
	public String getMessage() {
		return "Nata��o � a capacidade do homem e de outros animais de se deslocarem atrav�s de movimentos efetuados no meio l�quido, geralmente sem ajuda artificial. A nata��o � uma atividade que pode ser simultaneamente �til e recreativa. As suas principais utiliza��es s�o recreativas, balneares, pesca, exerc�cio e desporto.";
	}
}
