package ex02.mvc;

import java.util.ArrayList;

public class MvcMain { //view
	public static void main(String[] args) throws Exception {
	      DeptDAO dao = new DeptDAO();
	      
	      ArrayList<DeptDTO> list = dao.select();
	      for( DeptDTO dto : list ){
	    	  System.out.println(dto.dcode +"|" + dto.dname+"|"+dto.pdept+"|"+ dto.area);
	      }
	      ArrayList<DeptDTO> list2 = dao.delete();
	       for( DeptDTO dto : list2 ){
	    	  System.out.println(dto.dcode +"|" + dto.dname+"|"+dto.pdept+"|"+ dto.area);
	      }
	}

}
