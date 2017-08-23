package org.sbx.config;

import org.springframework.web.servlet.view.AbstractUrlBasedView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by loginov_a_s on 23.08.2017.
 */
public class ViewResolver extends InternalResourceViewResolver {

    public ViewResolver() {

        super();
        setPrefix("/WEB-INF/views/");
        setSuffix(".jsp");

    }

    protected AbstractUrlBasedView buildView(String viewName) throws Exception {
        if (viewName.isEmpty() || viewName.endsWith("/")) {
            viewName += "index";
        }

        return super.buildView(viewName);
    }

}
