package fsnip.powerdog.task.modules.lims2supervise.service;

import fsnip.powerdog.task.base.BaseService;
import fsnip.powerdog.task.modules.lims2supervise.entity.LimsSpBsbs;

/**
 * Created with IntelliJ IDEA.
 *
 * @description:
 * @author: kun.tan
 * @dateTime: 2018-12-19 17:46
 */
public interface LimsSpBsbsService extends BaseService<LimsSpBsbs> {

    LimsSpBsbs queryBySampleNo(String sampleNo);
}
