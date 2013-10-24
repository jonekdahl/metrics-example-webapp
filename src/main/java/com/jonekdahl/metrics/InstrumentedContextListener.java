package com.jonekdahl.metrics;

import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.servlet.InstrumentedFilterContextListener;

public class InstrumentedContextListener extends InstrumentedFilterContextListener {

	@Override
	protected MetricRegistry getMetricRegistry() {
		return MetricsInstance.get();
	}

}