package come.hhj.handler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;

import come.hhj.entity.Items;

/**
 * 
 * @author 阿赫瓦里
 * @Description:实现HttpRequestHandler接口的 处理器
 * 
 */
public class ItemsHandler2 implements HttpRequestHandler {

    public void handleRequest(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        //调用service查找 数据库，查询商品列表，这里使用静态数据模拟
        List<Items> itemsList = new ArrayList<Items>();
        //向list中填充静态数据
        
        Items items_1 = new Items();
        items_1.setName("笔记本电脑");
        items_1.setPrice(6000f);
        items_1.setDetail("联想笔记本电脑");
        
        Items items_2 = new Items();
        items_2.setName("苹果手机");
        items_2.setPrice(5000f);
        items_2.setDetail("iphone9手机！");
        
        itemsList.add(items_1);
        itemsList.add(items_2);
        //设置模型数据
        req.setAttribute("itemsList", itemsList);
        //设置转发的视图
        req.getRequestDispatcher("/WEB-INF/jsp/itemsList.jsp").forward(req, resp);
        //使用此方法可以通过修改response，设置响应的数据格式，比如响应json数据
        /*
                response.setCharacterEncoding("utf-8");
                response.setContentType("application/json;charset=utf-8");
                response.getWriter().write("json串");*/
    }
    
}