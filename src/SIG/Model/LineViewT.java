
package SIG.Model;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class LineViewT extends AbstractTableModel{
private ArrayList<LineInvoice> lines;
private String[] col = {"no","item","price","count","total price"};

    public LineViewT(ArrayList<LineInvoice> lines) {
        this.lines = lines;
    }

    public ArrayList<LineInvoice>getLines(){
    	return lines;
    }
    

 @Override
    public String getColumnName(int column) {
        return col[column] ; 
    }

 
 
    @Override
    public int getRowCount() {
      return lines.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        LineInvoice inv = lines.get(rowIndex);
        switch (columnIndex){
            case 0: return inv.getInvoice().getNum();
            case 1: return inv.getItem();
            case 2: return inv.getPrice();
            case 3: return inv.getCount();
            case 4: return inv.getTotal_line();
            default:return "";
        }
    }
    
    
    
    
    
    
    
    
    
    
    
}
