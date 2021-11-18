package com.bd.tpfinal.model;

public class Pending extends OrderStatus
{
    private Order order;

    public Pending(Order order)
    {
        this.order = order;
    }

    @Override
    public boolean canAssign()
    {
        return false;
    }

    @Override
    public boolean canRefuse()
    {
        return false;
    }

    @Override
    public boolean canDeliver()
    {
        return false;
    }

    @Override
    public boolean canFinish()
    {
        return false;
    }
}
