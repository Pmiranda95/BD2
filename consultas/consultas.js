
//CONSULTA 8 ESTA OK
db.Ventas.aggregate([
    {
        $match:{
            $and:[
                {fecha:{$gte:ISODate("2018-03-31"),$lt:ISODate('2019-09-31')}},
                {"sucursal.nombre":"sucursal_Lanus"}
                ]
            }
    } ,
    
    { 
        $project: { _id: "$cliente.dni",cliente:"$cliente",ventas:"$productoVendidos"} 
    },
    {
         $unwind: "$ventas"
     },
    
     { $group : { _id : "$cliente.dni","totalProductoVendido":{$sum:"$ventas.cantidad"} }}
    {$sort:{'totalProductoVendido':-1}}
     
])



//consulta 6 esta OK
   db.Ventas.aggregate([
    // crea un documento completo por cada element del array productoVendidos
    {
        $match:{
            $and:[
                {fecha:{$gte:ISODate("2018-03-31"),$lt:ISODate('2019-09-31')}},
                {"sucursal.nombre":"sucursal_avellaneda"}
                ]
            }
    } ,
    { $unwind: '$productoVendidos'},
    { $group : { _id : "$productoVendidos.producto.descripcion","totalProductoVendido":{$sum:"$productoVendidos.cantidad"} }}
    { $sort: {'totalProductoVendido': -1}},
    
   ])
   

//consulta 5

db.Ventas.aggregate([
    // crea un documento completo por cada element del array productoVendidos
    {
        $match:{
            $and:[
                {fecha:{$gte:ISODate("2018-03-31"),$lt:ISODate('2019-09-31')}},
                {"sucursal.nombre":"sucursal_avellaneda"}
                ]
            }
    } ,
    { $unwind: '$productoVendidos'},
    { $group : { _id : "$productoVendidos.producto.descripcion"}},
   { $project: {  totalMonto: { $multiply: [ "$productoVendidos.cantidad","$productoVendidos.producto.precio"] } } },
    { $sort: {totalMonto: -1}}
    
   ])


//consulta 4
db.Ventas.aggregate([
    {
        $match:{
            $and:[
                {fecha:{$gte:ISODate("2018-03-31"),$lt:ISODate('2019-09-31')}},
                {"sucursal.nombre":"sucursal_avellaneda"}
                ]
            }
    },
    {
         $unwind: "$productoVendidos"
    },
    
     { $group : { _id : "$productoVendidos.producto.tipo",total:{$sum:"$productoVendidos.producto.precio"}}}
    
    ])


//consulta 3

db.Ventas.aggregate([
    {$match:
        {
        
        $and: [
            {"sucursal.nombre":{$in:["sucursal_avellaneda"]}},
            { formaDePago:{$in:["tarjeta"]}},
            {fecha:{$gte:ISODate("2018-03-31"),$lt:ISODate('2019-09-31')}}
            ]
        }
    }, 
    {$group: { _id: "$numeroTicker",total:{$sum:"$precioTotal"}}}
])
    
//consulta 2
db.Ventas.aggregate([
    {
        $match:{
            $and:[
                {fecha:{$gte:ISODate("2018-03-31"),$lt:ISODate('2019-09-31')}},
                {"sucursal.nombre":"sucursal_avellaneda"}
                ]
            }
    },
    {
         $unwind: "$productoVendidos"
    },
    
     { $group : { _id : "$cliente.obraSocial.nombre",total:{$sum:"$productoVendidos.producto.precio"}}}
    
    ])


//CONSULTA 1
db.Ventas.aggregate([
    {$match:
        {
        
        $and: [
            {"sucursal.nombre":{$in:["sucursal_avellaneda"]}},
            {fecha:{$gte:ISODate("2018-03-31"),$lt:ISODate('2019-09-31')}}
            ]
        }
    }, 
    {$group: { _id: "$numeroTicker",total:{$sum:"$precioTotal"}}}
])