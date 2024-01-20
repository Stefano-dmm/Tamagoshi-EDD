public abstract class Regalo{
	int amistad;
	int costo;
	
	int amistad(){
		return amistad;
	}
	
	int costo(){
		return costo;
	}
	
	/**descripcion para el men&uacute; de la tienda
	 * Se recomienda usar el formato "nombre &lt;costo&gt;"
	 */
	abstract String menuItem();
}