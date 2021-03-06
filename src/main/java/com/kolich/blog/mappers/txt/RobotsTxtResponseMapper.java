/**
 * Copyright (c) 2015 Mark S. Kolich
 * http://mark.koli.ch
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 */

package com.kolich.blog.mappers.txt;

import com.kolich.blog.components.FreeMarkerConfig;
import com.kolich.blog.entities.txt.RobotsTxt;
import curacao.annotations.Injectable;
import curacao.annotations.Mapper;
import curacao.annotations.Required;

@Mapper
public final class RobotsTxtResponseMapper extends AbstractTxtResponseMapper<RobotsTxt> {

    private static final String ROBOTS_TXT_TEMPLATE_NAME = "txt/robots.ftl";

    @Injectable
    public RobotsTxtResponseMapper(@Required final FreeMarkerConfig config) {
        super(config);
    }

    @Override
    public final String getTemplateName() {
        return ROBOTS_TXT_TEMPLATE_NAME;
    }

}
