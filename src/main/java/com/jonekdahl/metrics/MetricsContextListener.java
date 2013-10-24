package com.jonekdahl.metrics;

import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.servlets.MetricsServlet;

public class MetricsContextListener extends MetricsServlet.ContextListener {

	@Override
	protected MetricRegistry getMetricRegistry() {
		return MetricsInstance.get();
	}
}