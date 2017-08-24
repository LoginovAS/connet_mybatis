Ext.onReady(function(){

    var jsonData;

    Ext.Ajax.request({
        url: 'jnodes',
        success: function(response) {
            jsonData = response.responseText;
        }
    });

    var nodeStore = new Ext.data.Store ({
        model: {
            extend: 'Ext.data.Model',
            fields: [ 'nodeName', 'region', 'street', 'building' ]
        },
        data: jsonData
    });

    Ext.create({
        xtype: 'grid',
        renderTo: Ext.getBody(),
        store: nodeStore,
        width: 600,
        height: 200,
        title: 'Nodes',
        columns: [
            {
                text: 'Node name',
                width: 100,
                sortable: false,
                hideable: false,
                dataIndex: 'nodeName'
            },
            {
                text: 'Region',
                width: 150,
                dataIndex: 'region'
            },
            {
                text: 'Street',
                dataIndex: 'street'
            },
            {
                text: 'Building',
                dataIndex: 'building'
            }
        ]
    }, 'Ext.grid.Panel');
});