Ext.onReady(function(){

    var data = [];

    Ext.Ajax.request({
        url: 'jnodes',
        success: function(response) {
            var res = Ext.decode(response.responseText, true);
            if(res !== null &&  typeof (res) !==  'undefined'){
                // loop through the data
                Ext.each(res.data, function(obj){
                    //add the records to the array
                    data.push({
                        id: obj.nodeId,
                        name: obj.nodeName,
                        region: obj.region,
                        street: obj.street,
                        building: obj.building
                    })
                });
                //update the store with the data that we got
//                nodeStore.loadData(data);
            }
        },
        failure : function(r){}
    });

    var nodeStore = new Ext.data.Store ({
            fields: [ 'nodeName', 'region', 'street', 'building' ],
            data: data,
            paging: false
    });

    Ext.create({
        xtype: 'grid',
        renderTo: 'testGridPanel',
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