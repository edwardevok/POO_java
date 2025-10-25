/**
 * La clase producto contiene la informacion mas relevante sobre un producto que
 * se encuentra en una farmacia
 * @author(Joan Mauri)
 * @author(Eduardo López)
 * @version(7/9/2025)
 */
public class Producto
{
    private int codigo;
    private String rubro;
    private String descripcion;
    private double costo;
    private int stock;
    private double porcPtoRepo;
    private int existMinima;
    private Laboratorio laboratorio;
    
    /**
     * Constructor para instanciar un objeto de la clase Producto
     * @param p_codigo codigo unico para identificar un producto
     * @param p_rubro rubro al que pertenece el producto
     * @param p_desc descripcion del producto
     * @param p_costo precio de costo del producto
     * @param p_porcPtoRepo 
     * @param p_existMinima
     * @param p_lab es el laboratorio en el que se encuentra el producto
     */
    Producto(int p_codigo, String p_rubro, String p_desc, double p_costo, double p_porcPtoRepo, int p_existMinima, Laboratorio p_lab){
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDescripcion(p_desc);
        this.setCosto(p_costo);
        this.setPorcPtoRepo(p_porcPtoRepo);
        this.setExistMinima(p_existMinima);
        this.setStock(0);
        this.setLab(p_lab);
    }
    
    /**
     * Constructor sobre cargado para instanciar un objeto de la clase producto.
     * @param p_codigo codigo unico para identificar un producto
     *  @param p_rubro rubro al que pertenece el producto
     * @param p_desc descripcion del producto
     * @param p_costo precio de costo del producto
     * @param p_lab es el laboratorio en el que se encuentra el producto
     */
    Producto(int p_codigo, String p_rubro, String p_desc, double p_costo, Laboratorio p_lab){
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDescripcion(p_desc);
        this.setCosto(p_costo);
        this.setStock(0);
        this.setLab(p_lab);
    }
    
    //setters
    private void setCodigo(int p_codigo){
        this.codigo = p_codigo;
    }
    
    private void setRubro(String p_rubro){
        this.rubro = p_rubro;
    }
    
    private void setDescripcion(String p_desc){
        this.descripcion = p_desc;
    }
    
    private void setCosto(double p_costo){
        this.costo = p_costo;
    }
    
    private void setStock(int p_stock){
        this.stock = p_stock;
    }
    
    private void setPorcPtoRepo(double p_porcPtoRepo){
        this.porcPtoRepo = p_porcPtoRepo;
    }
    
    private void setExistMinima(int p_existMinima){
        this.existMinima = p_existMinima;
    }
    
    private void setLab(Laboratorio p_lab){
        this.laboratorio = p_lab;
    }
    
    //getters
    public int getCodigo(){
        return this.codigo;
    }
    
    public String getRubro(){
        return this.rubro;
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }
    
    public double getCosto(){
        return this.costo;
    }
    
    public int getStock(){
        return this.stock;
    }
    
    public double getPorcPtoRepo(){
        return this.porcPtoRepo;
    }
    
    public int getExistMinima(){
        return this.existMinima;
    }

    public Laboratorio getLaboratorio(){
        return this.laboratorio;
    }
    
    /**
     * Este metodo permite modificar el stock de un producto, agregando o quitando unidades.
     * @param p_cantidad cantidad a agrega o quitar.
     */
    public void ajuste(int p_cantidad){
        this.setStock(this.getStock() + p_cantidad);
    }
    
    /**
     * Este metodo permite calcular el precio de lista de un producto
     * @return precio de lista el producto
     */
    public double precioLista(){
        return this.getCosto() + (this.getCosto() * 0.12);
    }
    
    /**
     * Este metodo permite calcular el precio contado de un producto
     * @return precio contado de un producto
     */
    public double precioContado(){
        return this.precioLista() - (this.precioLista()*0.05);
    }
    
    /**
     * Este metodo permite calcular la valorizacion del stock actual de un producto
     * @return valorizacion del stock de un producto
     */
    public double stockValorizado(){
        return (this.getStock() * this.getCosto()) * 0.12 + (this.getStock() * this.getCosto());
    }
    
    /**
     * Este metodo funciona como un setter para el atributo porcPtoRepo
     * @param p_porce porcentaje
     */
    public void ajustarPtoRepo(double p_porce){
        this.setPorcPtoRepo(p_porce);
    }
    
    /**
     * Este metodo funciona como un setter para el atributo existencia minima
     * @param p_cantidad cantidad de producto para existencia minima
     */
    public void ajustarExistMin(int p_cantidad){
        this.setExistMinima(p_cantidad);
    }
    
    /**
     * Este metodo muestra por pantalla un laboratorio, un producto, su descripcion, su precio de costo, su stock y su 
     * respectiva valorizacion
     */
    public void mostrar(){
        System.out.println(this.getLaboratorio().mostrar());
        System.out.println("\n");
        System.out.println("Rubro: " + this.getRubro());
        System.out.println("Descripcion: " + this.getDescripcion());
        System.out.println("Precio costo: " + this.getCosto());
        System.out.println("Stock: " + this.getStock() + " Stock valorizado: $" + this.stockValorizado());
    }
    
    /**
     * Este metodo muestra por pantalla la descripcion de un producto, su precio de lista y precio contado.
     * @return devuelve la informacion en una sola linea
     */
    public String mostrarLinea(){
        return(getDescripcion() + "\t" + this.precioLista() + "\t" + this.precioContado());
    }
    
    
}


