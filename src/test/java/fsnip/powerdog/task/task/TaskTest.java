package fsnip.powerdog.task.task;

import fsnip.powerdog.task.common.utils.SampleReportUtil;
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
public class TaskTest {

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
    Smart2FsnipTask smart2FsnipTask;

    @Test
    public void synFromDataCenter2Supervise() {
        smart2FsnipTask.synFromDataCenter2Supervise();
    }

    @Test
    public void synSmartDataFromDataCenter2Supervise() {
        smart2FsnipTask.synSmartDataFromDataCenter2Supervise();
    }

    @Autowired
    Fsnip2SmartTask fsnip2SmartTask;

    @Test
    public void synQuickCheckDataFromSupervise2DataCenter() {
        fsnip2SmartTask.synQuickCheckDataFromSupervise2DataCenter();
    }

    @Autowired
    Lims2SuperviseTask lims2SuperviseTask;

    @Test
    public void synSampleDataFromLimis2Supervise() {
        lims2SuperviseTask.synSampleDataFromLimis2Supervise();
    }

    @Test
    public void gen() {
        System.out.println(SampleReportUtil.generatePresignedUrl("lims/LIMS4/BusinessUnits/publish/0/achive/59416/DC18520100690261144_59416_1535696863825.pdf"));
    }
}