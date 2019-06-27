//consulta 6
db.Ventas.find({})
   .projection({})
   .sort({_id:-1})
   .limit(100)
   
   db.Ventas.aggregate([
    // crea un documento completo por cada element del array productoVendidos
    { $unwind: '$productoVendidos'},
    { $group : { _id : "$productoVendidos.producto.descripcion" } },
    { $sort: {'productoVendidos.cantidad': -1}},
    
   ])
   
//CONSULTA 8
db.Ventas.aggregate([
    {
        $match:{fecha:{$gte:ISODate("2018-03-31"),$lt:ISODate('2019-09-31')}}
    }, 
    {
         $unwind: "$productoVendidos"
     },
     { 
        $group: { _id: "$id","totalCosas":{$sum:"$productoVendidos.cantidad"}} 
    },
])