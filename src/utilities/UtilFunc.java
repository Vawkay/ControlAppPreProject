package utilities;

public class UtilFunc {
	
	public UtilFunc(){}
	
	public static boolean validadorSN(String resposta) {
		boolean sn = null != null;
		if (resposta.equals("s") || resposta.equals("n") && resposta != null) {
			sn = true;
		} else {
			sn = false;
		}
		return sn;
	}
}
