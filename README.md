# task26-1

GET http://localhost:8181/piezas/findAll

GET http://localhost:8181/proveedores/findAll

GET http://localhost:8181/suministros/findAll

PUT http://localhost:8181/piezas/delete{id}

PUT http://localhost:8181/proveedores/delete{id}

PUT http://localhost:8181/suministros/delete{id}

PUT http://localhost:8181/piezas/create {"nombre":"piezaX"}

PUT http://localhost:8181/proveedores/create {"nombre":"porveedor X"}

PUT http://localhost:8181/suministros/create {"pieza":{"codigo":1},"proveedor":{"id":1},"precio":100}

PUT http://localhost:8181/piezas/update {"codigo":1,"nombre":"piezaX"}

PUT http://localhost:8181/proveedores/update {"id":1,"nombre":"porveedor X"}

PUT http://localhost:8181/suministros/update {"id":1,"pieza":{"codigo":1},"proveedor":{"id":1},"precio":100}




