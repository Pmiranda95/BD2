//CONSULTA 3
db.Ventas.aggregate([
    {$match:
        {
        formaDePago:"tarjeta",
        $and: [
            {fecha:{$gte:ISODate("2018-03-31"),$lt:ISODate('2019-09-31')}}
            ]
        }
    }, 
    {$group: { _id: "$id",total:{$sum:"$precioTotal"}}}
])