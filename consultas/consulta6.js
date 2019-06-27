//consulta 6 esta OK
db.Ventas.find({})
   .projection({})
   .sort({_id:-1})
   .limit(100)
   
   db.Ventas.aggregate([
    // crea un documento completo por cada element del array productoVendidos
    {
        $match:{fecha:{$gte:ISODate("2018-03-31"),$lt:ISODate('2019-09-31')}}
    },
    { $unwind: '$productoVendidos'},
    { $group : { _id : "$productoVendidos.producto.descripcion","totalProductoVendido":{$sum:"$productoVendidos.cantidad"} }}
    { $sort: {'totalProductoVendido': -1}},
    
   ])
   
//CONSULTA 8 ESTA MASOMENOS
db.Ventas.aggregate([
    {
        $match:{fecha:{$gte:ISODate("2018-03-31"),$lt:ISODate('2019-09-31')}}
    }, 
    {
         $unwind: "$productoVendidos"
     },
    
    
     { $group : { _id : "$productoVendidos.producto.descripcion","totalProductoVendido":{$sum:"$productoVendidos.cantidad"} }}
    {$sort:{'totalProductoVendido':-1}}
     { 
        $group: { _id: "$cliente.dni"} 
    },
])

