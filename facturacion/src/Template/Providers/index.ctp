<?php
/**
 * @var \App\View\AppView $this
 * @var \App\Model\Entity\Provider[]|\Cake\Collection\CollectionInterface $providers
 */
?>

<link href="css/all.min.css" rel="stylesheet">
    <style>
    .page-header{   
    margin-top: 10px;
   
    }
    .btn.btn-sm.btn-primary{
        float: right;
        position: relative;
        margin-top: 5px;
        margin-bottom: 15px;
    }
    .nav-scroller.bg-white.shadow-sm{
        margin-top: 10px;
    }
    
    </style>

    <div  style="background: #0D1D52;">
            <ul class="nav nav-tabs">
              
                <li class="nav-item">
	                <?= $this->Html->link(__('List Persons'), ['controller' => 'Persons', 'action' => 'index'], ['class' => 'nav-link']) ?>
                </li>
                <li class="nav-item">
                	<?= $this->Html->link(__('New Person'), ['controller' => 'Persons', 'action' => 'add'], ['class' => 'nav-link']) ?>
                </li>
                <li class="nav-item">
                	<?= $this->Html->link(__('List Products'), ['controller' => 'Products', 'action' => 'index'], ['class' => 'nav-link']) ?>
                </li>
                <li class="nav-item">
                	<?= $this->Html->link(__('New Product'), ['controller' => 'Products', 'action' => 'add'], ['class' => 'nav-link']) ?>
                </li>
            </ul>
    </div>


<div class="row" background="">
    <div class="col-md-12">
        <div class='page-header'>
            <h3>
                <?= __('Providers') ?>
                
                <?= $this->Html->link($this->Html->tag('i', '', ['class' => 'fa fa-plus']).__('New'), ['controller' => 'Providers', 'action' => 'add'], ['class' => 
                'btn btn-sm btn-primary', 'escape' => false]) ?>
            </h3>
        </div>
        <div class="table-responsive">            
           <table class='table'>
                <thead class="thead-light">
                    <tr>
                        <th scope="col"><?= $this->Paginator->sort('id') ?></th>
                        <th scope="col"><?= $this->Paginator->sort('person_id') ?></th>
                        <th scope="col" class="actions"><?= __('Actions') ?></th>
                    </tr>
                </thead>
                <tbody>
                    <?php foreach ($providers as $provider): ?>
                    <tr>
                        <td><?= $this->Number->format($provider->id) ?></td>
                        <td><?= $provider->has('person') ? $this->Html->link($provider->person->name, ['controller' => 'Persons', 'action' => 'view', $provider->person->id]) : '' ?></td>
                        <td class="actions">
                            <?= $this->Html->link(__('View'), ['action' => 'view', $provider->id],['class'=>'btn btn-sm btn-info']  ) ?>
                            <?= $this->Html->link(__('Edit'), ['action' => 'edit', $provider->id], ['class' =>'btn btn-sm btn-warning']  ) ?>
                            <?= $this->Form->postLink(__('Delete'), ['action' => 'delete', $provider->id],
                            ['confirm' => __('Are you sure you want to delete # {0}?', $provider->id), 'class'=>'btn btn-sm btn-danger']) ?>
                        </td>
                    </tr>
                    <?php endforeach; ?>
                </tbody>
            </table>
            
        </div>

        <div class="paginator">
                <ul class="pagination">    
                     <?php
                        echo $this->BootsCakePaginator->first();
                        echo $this->BootsCakePaginator->prev();
                        echo $this->BootsCakePaginator->numbers();
                        echo $this->BootsCakePaginator->next();
                        echo $this->BootsCakePaginator->last();
                     /*
                    $this->Paginator->templates([
                        'prevActive' => '<li class="page-item"><a class="page-link" href="{{url}}">{{text}}</a></li>',
                        'prevDisabled' => '<li class="page-item disabled"><a class="page-link" href="{{url}}">{{text}}</a></li>',
                        'number' => '<li class="page-item"><a class="page-link" href="{{url}}">{{text}}</a></li>',
                        'current' => '<li class="page-item"><a class="page-link" href="{{url}}">{{text}}</a></li>',
                        'nextActive' => '<li class="page-item"><a class="page-link" href="{{url}}">{{text}}</a></li>',
                        'nextDisabled' => '<li class="page-item disabled"><a class="page-link" href="{{url}}">{{text}}</a></li>'
                    ]); ?>            
                    <?= $this->Paginator->first('<< ' . __('first')) ?>
                    <?= $this->Paginator->prev('< ' . __('previous'), ['tag' => 'li', 'escape' => false], '<a href="#">&laquo;</a>', ['class' => 'prev disabled', 'tag' => 'li', 'escape' => false]) ?>
                    <?= $this->Paginator->numbers() ?>
                    <?= $this->Paginator->next(__('next') . ' >') ?>
                    <?= $this->Paginator->last(__('last') . ' >>')*/ 
                    ?>
                </ul>
                <p><?= $this->Paginator->counter(['format' => __('Page').' {{page}} '.__('of').' {{pages}}, '.__('showing')
                .' {{current}} '.__('record').'(s) '.__('out of total').' {{count}} ']) ?></p>

        </div>
    </div>
</div>
