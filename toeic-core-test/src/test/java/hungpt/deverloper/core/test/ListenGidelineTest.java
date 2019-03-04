package hungpt.deverloper.core.test;

import hungpt.deverloper.core.dao.ListenguidelineDao;
import hungpt.deverloper.core.daoimpl.ListenguidelineImpl;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class ListenGidelineTest {

 ListenguidelineDao listenGuidelineDao;
    @BeforeTest
    public void initData() {
        listenGuidelineDao = new ListenguidelineImpl();
    }

//    @Test
//    public void testFindByProperties() {
//        ListenguidelineDao listenGuidelineDao = new ListenguidelineImpl();
//        Object[] result = listenGuidelineDao.findByProperty(null, null, null, null, 2, 2);
//    }

//    @Test
//    public void checkApiFindbyproperty() {
//        Map<String, Object> property = new HashMap<String, Object>();
//        property.put("title", "Bai hd 8");
//        property.put("content", "Noi dung bai hd 8");
//        Object[] objects = listenGuidelineDao.findByProperty(property, null, null, null, null);
//    }

}
