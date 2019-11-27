package fsnip.powerdog.task.task;

import fsnip.powerdog.task.common.utils.SampleReportUtil;
import fsnip.powerdog.task.modules.spsc2fsnip.service.ScXkzxxService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * Created with IntelliJ IDEA.
 *
 * @description:
 * @author: kun.tan
 * @dateTime: 2018-09-11 14:20
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestService {

    protected MockMvc mvc;
    @Autowired
    protected WebApplicationContext webApplicationConnect;

    public void setUp() throws Exception {
        mvc = MockMvcBuilders.webAppContextSetup(webApplicationConnect).build();
    }

    public MockHttpServletRequestBuilder post(String uri) {
        return MockMvcRequestBuilders.post(uri)
                .accept(MediaType.APPLICATION_JSON);
    }

    public MockHttpServletRequestBuilder get(String uri) {
        return MockMvcRequestBuilders.get(uri)
                .accept(MediaType.APPLICATION_JSON);
    }

    @Autowired
    private ScXkzxxService scXkzxxService;

    // 同步数据
    @Test
    public void testSamllSync() {
        scXkzxxService.synSmallWorkshopCheck2Sc();
    }

    // 同步生产许可
    @Test
    public void testSCSync() {
        String startTime = "2019-07-16";
        String endTime = "2019-07-16";
        scXkzxxService.synchronizationSC2CenterDatabase(startTime,endTime);
    }

    @Test
    public void testscXZF(){
        String startTime = "2019-07-18";
        String endTime = "2019-07-18";
        scXkzxxService.synchronizationSC2CenterDatabase(startTime,endTime);
    }

    @Autowired
    Smart2FsnipTask smart2FsnipTask;
    @Test
    public void test(){
        smart2FsnipTask.synSmartDataFromDataCenter2Supervise();
    }



}