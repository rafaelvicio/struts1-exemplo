package br.com.rafaelvicio.action;

public class TesteSimplesAction extends Action {
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("Executando o c�digo da l�gica de neg�cios...");
		return mapping.findForward("ok");
	}
	
}
