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
    
   ]
)