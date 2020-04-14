package org.ko.analysis.store.ads.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.ko.analysis.store.ads.service.AdsDashboardService;
import org.ko.analysis.store.ads.domain.AdsDashboard;
import org.ko.analysis.store.ads.repository.AdsDashboardRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * description: TestServiceImpl <br>
 * date: 2020/4/13 22:07 <br>
 *
 * @author K.O <br>
 * @version 1.0 <br>
 */
@Service
@Transactional(rollbackFor = Throwable.class)
public class AdsDashboardServiceImpl extends ServiceImpl<AdsDashboardRepository, AdsDashboard>
        implements AdsDashboardService {


}