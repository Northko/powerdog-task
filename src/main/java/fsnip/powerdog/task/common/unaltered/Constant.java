package fsnip.powerdog.task.common.unaltered;

import org.apache.commons.lang.StringUtils;

/**
 * 常量
 *
 * @author kun.tan
 * @email
 * @date 2018-7-12 14:31:28
 */
public class Constant {

    /**
     * 定时任务状态
     *
     * @author kun.tan
     * @email
     * @date 2016年12月3日 上午12:07:22
     */
    public enum ScheduleStatus {
        /**
         * 正常
         */
        NORMAL(0),
        /**
         * 暂停
         */
        PAUSE(1);

        private int value;

        ScheduleStatus(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    /**
     * 未同步
     */
    public static final Integer SYN_STATUS_NO = 0;
    /**
     * 已同步
     */
    public static final Integer SYN_STATUS_YES = 1;

    public enum InspectCheckResult {

        QUALIFICATION("符合"), BASIC_QUALIFICATIONS("基本符合"), DISQUALIFICATION("不符合"), UNKNOWN("未知");
        private String result;

        InspectCheckResult(String result) {
            this.result = result;
        }

        public String getResult() {
            return result;
        }
    }

    public enum EntType {

        PRODUCTION("1", "生产"), CIRCULATION("2", "流通"), CATERING("3", "餐饮"), SMALL_WORKSHOP("小作坊", "小作坊");
        private String type;
        private String desc;

        EntType(String type, String desc) {
            this.type = type;
            this.desc = desc;
        }

        public String getType() {
            return type;
        }

        public String getDesc() {
            return desc;
        }

        public static String getTypeByDesc(String desc) {
            if (StringUtils.isNotBlank(desc)) {
                for (EntType value : EntType.values()) {
                    if (desc.contains(value.getDesc())) {
                        return value.getType();
                    }
                }
            }
            return desc;
        }
    }
}
