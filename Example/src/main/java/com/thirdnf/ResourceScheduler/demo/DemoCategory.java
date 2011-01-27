package com.thirdnf.ResourceScheduler.demo;

import org.jetbrains.annotations.NotNull;

import java.awt.*;

/**
* Created by IntelliJ IDEA.
* User: jgerth
* Date: 1/25/11
* Time: 11:10 PM
* To change this template use File | Settings | File Templates.
*/
public class DemoCategory
{
    private final Color _color;
    private final String _title;

    /**
     * Create the category.
     * @param title (not null) Title of the category
     * @param color (not null) Color for the category
     */
    public DemoCategory(@NotNull String title, @NotNull Color color)
    {
        _title = title;
        _color = color;
    }


    /**
     * This model uses categories to color the appointments so this category color determines the
     * appointment color.
     * @return (not null) Color for the category.
     */
    @NotNull
    public Color getColor()
    {
        return _color;
    }


    @NotNull
    public String getTitle()
    {
        return _title;
    }


    @Override
    public String toString()
    {
        return _title;
    }
}
