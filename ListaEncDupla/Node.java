package ListaEncDupla;

public class Node {
     int conteudo;
     Node anterior;
     Node proximo;

    public int getData() {
		return conteudo;
	}

	public void setData(int data) {
		this.conteudo = data;
	}

	public Node(int data) {
        this.conteudo = data;
        this.anterior = null;
        this.proximo = null;
    }
}
