package fsnip.powerdog.task.modules.rest.oss;

import fsnip.powerdog.task.common.utils.SampleReportUtil;
import fsnip.powerdog.task.modules.lims2supervise.entity.LimsSpBsbs;
import fsnip.powerdog.task.modules.lims2supervise.service.LimsSpBsbsService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @description: AccessEndpoint
 * @author: kun.tan
 * @dateTime: 2019-01-03 10:45
 */
@RestController
@RequestMapping("/access")
public class AccessEndpoint {

    public static final String BIAS = "/";
    @Autowired
    private LimsSpBsbsService limsSpBsbsService;

    @GetMapping("/sampleReport")
    public String ossAccess(@RequestParam String key) {
        if (StringUtils.isBlank(key)) {
            return "";
        } else if (key.startsWith(BIAS)) {
            key = key.substring(1);
        }
        return SampleReportUtil.generatePresignedUrl(key);
    }

    @GetMapping("/report")
    public String sampleReport(@RequestParam String sampleNo) {
        LimsSpBsbs limsSpBsbs = limsSpBsbsService.queryBySampleNo(sampleNo);
        if (null == limsSpBsbs) {
            return "";
        }
        return ossAccess(limsSpBsbs.getUrl());
    }
}
