package fsnip.powerdog.task.common.utils;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;

import java.net.URL;
import java.util.Calendar;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @description: SampleReportUtil
 * @author: kun.tan
 * @dateTime: 2019-01-03 9:50
 */
public class SampleReportUtil {

    private static final String accessKeyId = "LTAIeVoWBIJa2G8F";
    private static final String accessKeySecret = "B1z79SvE94RsPaEDDiLHAtQyBvjx3D";
    private static final String endpoint = "http://oss-cn-shenzhen.aliyuncs.com";
    public static final String bucketName = "fscprod";

    public static final int EXPIRATION_SECONDS = 60 * 30;

    private static OSS ossClient;

    static {
        ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
    }

    private SampleReportUtil() {

    }

    public static String generatePresignedUrl(String objectId) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.SECOND, EXPIRATION_SECONDS);
        return generatePresignedUrl(objectId, calendar.getTime());
    }

    public static String generatePresignedUrl(String objectId, Date expiration) {
        URL url = ossClient.generatePresignedUrl(bucketName, objectId, expiration);
        return url.toString();
    }
}
