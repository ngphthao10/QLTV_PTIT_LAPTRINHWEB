package poly.controller;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import poly.entity.TuaSach;



@Controller
@RequestMapping("/sach/")
public class sachController {
	@Autowired
	SessionFactory factory;
	
	@Transactional
	@RequestMapping("query")
	public String query(ModelMap model)
	{
		Session session = factory.getCurrentSession();
		String hql = "from TuaSach";
		Query query = session.createQuery(hql);
		List<TuaSach> list = query.list();
		model.addAttribute("sach", list);
		return "sach/tuasach";
		
	}
}