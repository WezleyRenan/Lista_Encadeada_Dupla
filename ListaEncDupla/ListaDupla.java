package ListaEncDupla;

public class ListaDupla {
	    Node cabeca;
	    Node cauda;

	    public ListaDupla() {
	        this.cabeca = null;
	        this.cauda = null;
	    }

	    public void AdicionarInicio(int conteudo) {
	        Node novoNode = new Node(conteudo);

	        if (cabeca == null) {
	        	cabeca = novoNode;
	            cauda = novoNode;
	        } else {
	            novoNode.proximo = cabeca;
	            cabeca.anterior = novoNode;
	            cabeca = novoNode;
	        }
	    }

	    public void AdicionarFim(int conteudo) {
	        Node novoNode = new Node(conteudo);

	        if (cauda == null) {
	        	cabeca = novoNode;
	            cauda = novoNode;
	        } else {
	            novoNode.anterior = cauda;
	            cauda.proximo = novoNode;
	            cauda = novoNode;
	        }
	    }

	    public void AdicionarPosicao(int conteudo, int posicao) throws Exception {
	        if (posicao <= 0) {
	        	throw new Exception("posiçao invalida");
	            
	        }

	        if (posicao == 1) {
	            AdicionarInicio(conteudo);
	        } else {
	            Node novoNode = new Node(conteudo);
	            Node atual = cabeca;
	            int posicaoAtual = 1;

	            while (atual != null && posicaoAtual < posicao - 1) {
	                atual = atual.proximo;
	                posicaoAtual++;
	            }

	            if (atual == null) {
	                throw new Exception("posicao invalida");
	            }

	            novoNode.proximo = atual.proximo;
	            novoNode.anterior = atual;
	            if (atual.proximo != null) {
	                atual.proximo.anterior = novoNode;
	            }
	            atual.proximo = novoNode;

	            if (novoNode.proximo == null) {
	                cauda = novoNode;
	            }
	        }
	    }

	    public void remover(int data) {
	        Node atual = cabeca;

	        while (atual != null) {
	            if (atual.conteudo == data) {
	                if (atual == cabeca) {
	                	cabeca = atual.proximo;
	                    if (cabeca != null) {
	                    	cabeca.anterior = null;
	                    }
	                    if (cabeca == null) {
	                    	cauda = null;
	                    }
	                } else if (atual == cauda) {
	                	cauda = atual.anterior;
	                	cauda.proximo = null;
	                } else {
	                	atual.anterior.proximo = atual.proximo;
	                	atual.proximo.anterior = atual.anterior;
	                }
	                return;
	            }

	            atual = atual.proximo;
	        }
	    }

	    public void Mostrar() {
	        Node atual = cabeca;
	        int cont = 1;

	        while (atual != null) {
	            System.out.println(atual.conteudo + " posicao:" + cont);
	            atual = atual.proximo;
	            cont++;
	        }

	        System.out.println();
	    }
	    public void MostrarInverso(int tamanho) {
	        Node atual = cauda;

	        while (atual != null && tamanho > 0) {
	            System.out.println(atual.conteudo + " posicao:" + tamanho);
	            atual = atual.anterior;
	            tamanho--;
	        }

	        System.out.println();
	    }
	    public int getTamanho() {
	        int tamanho = 0;
	        Node atual = cabeca;

	        while (atual != null) {
	            tamanho++;
	            atual = atual.proximo;
	        }

	        return tamanho;
	    }
	}
	