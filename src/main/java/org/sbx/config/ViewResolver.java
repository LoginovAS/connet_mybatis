package org.sbx.config;

import org.springframework.web.servlet.view.AbstractUrlBasedView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

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
