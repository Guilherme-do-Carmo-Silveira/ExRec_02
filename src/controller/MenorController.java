package controller;

public class MenorController {

	public MenorController() {
		super();
	}
	
	public int MenorValor(int [] vt, int tamanho, int ultvalor) {
		if(tamanho == 0) {
			return ultvalor;
		}else {
			tamanho--;
			if(vt[tamanho] < ultvalor) {
				ultvalor = vt[tamanho];
			}
		}
		return MenorValor(vt, tamanho, ultvalor);
	}
}
