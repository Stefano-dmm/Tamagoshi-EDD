public class Cartera{
	/**saldo*/
	int watts;
	
	/**agrega al saldo
	 * @param watts Cu&aacute;nto agregar
	 */
	public void acreditar(int watts){
		this.watts += watts;
	}
	
	/**resta al saldo
	 * @param watts Cu&aacute;nto restar
	*/
	public void debitar(int watts){
		if(this.watts < watts){
			throw new IllegalStateException("Saldo insuficiente");
		}else{
			this.watts -= watts;
		}
	}
	
	/**obtener saldo
	 @returns el saldo actual
	 */
	public int saldo(){
		return this.watts;
	}
}