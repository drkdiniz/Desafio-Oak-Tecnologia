package entities;

public class Products {
		private String name;
	    private String description;
	    private double value;
	    private boolean forSale;
		
	    public Products() {
		}

		public Products(String name, String description, double value, boolean forSale) {
			super();
			this.name = name;
			this.description = description;
			this.value = value;
			this.forSale = forSale;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public double getValue() {
			return value;
		}

		public void setValue(double value) {
			this.value = value;
		}

		public boolean isForSale() {
			return forSale;
		}

		public void setForSale(boolean forSale) {
			this.forSale = forSale;
		}

		@Override
	    public String toString() {
	        return String.format(
	            "Nome do Produto: %s\n" +
	            "Descrição: %s\n" +
	            "Valor: R$ %.2f\n" +
	            "Disponível para venda: %s\n",
	            name, description, value, forSale ? "Sim" : "Não"
	        );
		}

			
		}
	        
	

